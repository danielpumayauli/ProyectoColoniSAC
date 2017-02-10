package com.ed.test;

import com.edproj.dao.UsuarioDAO;
import com.edproj.modelos.Usuario;

public class PruebaConexion {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.autenticar("dpumayauli", "Clave123+");
        System.out.println("Nombre: "+usuario.nombre);
        System.out.println("Perfil: "+usuario.perfil);
    }
}
