package org.example.cliente.modelo.usuario;

import java.io.Serializable;
import java.util.Objects;

public class Contacto implements Serializable {
    private String nombre;
    private String ip;
    private int puerto;

    public Contacto() {
    }

    public Contacto(Usuario usuario) {
        this.nombre = usuario.getNombre();
        this.ip = usuario.getIp();
        this.puerto = usuario.getPuerto();
    }

    public Contacto(Contacto c){
        this.nombre = c.getNombre();
        this.ip = c.getIp();
        this.puerto = c.getPuerto();
    }

    public Contacto(String nombre, String ip, int puerto) {
        this.nombre = nombre;
        this.ip = ip;
        this.puerto = puerto;
    }
    public static Contacto fromUsuario(Usuario usuario) {
        return new Contacto(usuario);
    }

    public static Usuario toUsuario(Contacto usuarioDTO) {
        return new Usuario(usuarioDTO.getNombre(), usuarioDTO.getIp(), usuarioDTO.getPuerto());
    }

    public String getNombre() {
        return nombre;
    }

    public String getIp() {
        return ip;
    }

    public int getPuerto() {
        return puerto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())

            return false;

        Contacto that = (Contacto) o;
        System.out.println("equals");
        System.out.println("this: " + this);
        System.out.println("that: " + that);
        return this.nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nombre='" + nombre + '\'' +
                ", ip='" + ip + '\'' +
                ", puerto=" + puerto +
                '}';
    }




}
