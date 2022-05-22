package com.abn.exemplojsp4.web;

import com.abn.exemplojsp4.models.Usuario;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "JsonServlet", urlPatterns = {"/api"})
public class JsonServlet extends HttpServlet {

    PrintWriter out;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        out = response.getWriter();
        try {
            Collection<Usuario> cu = new ArrayList<>();
            Gson json = new Gson();
            String nome = request.getParameter("nome");
            System.out.println(nome);
            cu.add(new Usuario("a", "a"));
            cu.add(new Usuario("b", "b"));
            String res = json.toJson(cu);
            System.out.println(res);
            out.println(res);
        } catch (Exception e) {
            out.println(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        out = response.getWriter();
        try {
            //
            //pegar dados por parametro.
            //
            //String data = request.getParameter("parametro");
            //Gson json = new Gson();
            //System.out.println(data);
            //Usuario u = json.fromJson(data, Usuario.class);
            //System.out.println(u.toString());
            //out.println(json.toJson(u));
            //
            //pegar daods por json
            //
            StringBuilder data = new StringBuilder();
            BufferedReader reader = request.getReader();
            String linha;
            while((linha = reader.readLine()) != null) {
               data.append(linha);
            }
            //
            Gson json = new Gson(); 
            Usuario u = json.fromJson(data.toString(), Usuario.class);            
            System.out.println(u.toString());
            out.println(json.toJson(u));
            //
            //String nome = data.toString().substring(9,10);
            //String endereco = data.toString().substring(24,25);
            //Usuario u = new Usuario(nome, endereco);
            //System.out.println(u.toString());
            //out.println(json.toJson(u));
            //
        } catch (Exception e) {
            out.println(e);
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        out = response.getWriter();
        try {
            //
            //pegar dados por parametro.
            //
            //String data = request.getParameter("parametro");
            //Gson json = new Gson();
            //System.out.println(data);
            //Usuario u = json.fromJson(data, Usuario.class);
            //System.out.println(u.toString());
            //out.println(json.toJson(u));
            //
            //pegar daods por json
            //
            StringBuilder data = new StringBuilder();
            BufferedReader reader = request.getReader();
            String linha;
            while((linha = reader.readLine()) != null) {
                data.append(linha);
            }
            //
            Gson json = new Gson(); 
            Usuario u = json.fromJson(data.toString(), Usuario.class);
            System.out.println(u.toString());
            out.println(json.toJson(u));
            //
            //String nome = data.toString().substring(9,10);
            //String endereco = data.toString().substring(24,25);
            //Usuario u = new Usuario(nome, endereco);
            //System.out.println(u.toString());
            //out.println(json.toJson(u));
            //
        } catch (Exception e) {
            out.println(e);
        }
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        out = response.getWriter();
        try {
            //pegar dados por parametro.
            //
            //String data = request.getParameter("parametro");
            //Gson json = new Gson();
            //System.out.println(data);
            //Usuario u = json.fromJson(data, Usuario.class);
            //System.out.println(u.toString());
            //out.println(json.toJson(u));
            //
            //pegar daods por json
            //
            StringBuilder data = new StringBuilder();
            BufferedReader reader = request.getReader();
            String linha;
            while((linha = reader.readLine()) != null) {
                data.append(linha);
            }
            //
            Gson json = new Gson(); 
            Usuario u = json.fromJson(data.toString(), Usuario.class);            
            System.out.println(u.toString());
            out.println(json.toJson(u));
            //
            //String nome = data.toString().substring(9,10);
            //String endereco = data.toString().substring(24,25);
            //Usuario u = new Usuario(nome, endereco);
            //System.out.println(u.toString());
            //out.println(json.toJson(u));
            //            
        } catch (Exception e) {
            out.println(e);
        }
    }

}
