/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.ws;

import com.prueba.dao.ProcesoDAO;
import com.prueba.to.LLantaTO;
import com.prueba.to.TrianguloTO;
import com.prueba.to.UsuarioTO;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 *
 * @author freet
 */
@WebService(serviceName = "WSServer", targetNamespace = "ws.proyecto.com")
@Stateless
public class WSServer {

    @Resource
    WebServiceContext wsContext;

//    
    @EJB(beanName = "controladorUsuario")
    private ProcesoDAO controladorUsuario;
    @EJB(beanName = "controladorLlanta")
    private ProcesoDAO controladorLlanta;

    @WebMethod(operationName = "crearUsuario")
    public boolean crearUsuario(@WebParam(name = "apaterno") String apaterno, @WebParam(name = "amaterno") String amaterno, @WebParam(name = "nombre") String nombre, @WebParam(name = "email") String email,
            @WebParam(name = "webservices") int webservices) {
        return controladorUsuario.create(
                new UsuarioTO(apaterno, amaterno, nombre, email, webservices)
        );
    }

    @WebMethod(operationName = "crearLlanta")
    public boolean crearLlanta(@WebParam(name = "tag") String tag) {
        return controladorLlanta.create(new LLantaTO(tag));
    }

    @WebMethod(operationName = "editarLlanta")
    public boolean editarLlanta(@WebParam(name = "id") int idtag, @WebParam(name = "tag") String tag) {
        LLantaTO ll = (LLantaTO) controladorLlanta.find(idtag);
        ll.setTag(tag);
        return controladorLlanta.edit(ll);
    }

    @WebMethod(operationName = "consultarUsuarios")
    public List<UsuarioTO> consultarUsuarios() {
        MessageContext mc = wsContext.getMessageContext();
        HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
        System.out.println("Entro a consultarUsuarios: " + req.getRemoteAddr());
        return controladorUsuario.findEntities();
    }

    @WebMethod(operationName = "consultarLlantas")
    public List<LLantaTO> consultarLlantas() {
        MessageContext mc = wsContext.getMessageContext();
        HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
        System.out.println("Entro a consultarLLantas: " + req.getRemoteAddr());
        return controladorLlanta.findEntities();
    }

    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "User") String user, @WebParam(name = "Password") String password) {
        System.out.println("Request: " + user + " | " + password);
        return "Hola: " + user + " " + new Date();
    }

    @WebMethod(operationName = "suma")
    public double suma(@WebParam(name = "Valora") double a, @WebParam(name = "ValorB") double b) {
        System.out.println("Request: " + a + " | " + b);
        double result = a + b;
        System.out.println("Response: " + result);
        return result;
    }

    @WebMethod(operationName = "calcularTriangulo")
    public TrianguloTO calcularTriangulo(@WebParam(name = "Base") int base, @WebParam(name = "Altura") int altura, @WebParam(name = "Lado") int lado) {
        MessageContext mc = wsContext.getMessageContext();
        HttpServletRequest req = (HttpServletRequest) mc.get(MessageContext.SERVLET_REQUEST);
        System.out.println("Request: " + req.getRemoteAddr() + " | " + base + " | " + altura + " | " + lado);
        return new TrianguloTO(base, altura, lado);
    }
}
