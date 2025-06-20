package org.example.cliente.modelo.usuario;

import org.example.cliente.modelo.conversacion.Conversacion;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Clase que representa a un usuario en el sistema.
 */
public class Usuario implements Serializable {
    private String nombre;
    private String ip;
    private int puerto;
    private List<Contacto> contactos = new ArrayList<>();
    private Map<Contacto, Conversacion> conversaciones = new ConcurrentHashMap<>();

    /**
     * Constructor de la clase Usuario.
     * @param nombre El nombre del usuario.
     * @param ip La dirección IP del usuario.
     * @param puerto El puerto de conexión del usuario.
     */
    public Usuario(String nombre, String ip, int puerto) {
        this.nombre = nombre;
        this.ip = ip;
        this.puerto = puerto;
    }

    /**
     * Obtiene el nombre del usuario.
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la dirección IP del usuario.
     * @return La dirección IP del usuario.
     */
    public String getIp() {
        return ip;
    }

    /**
     * Obtiene el puerto de conexión del usuario.
     * @return El puerto de conexión del usuario.
     */
    public int getPuerto() {
        return puerto;
    }

    /**
     * Obtiene las conversaciones del usuario.
     * @return Un mapa de las conversaciones del usuario.
     */
    public Map<Contacto, Conversacion> getConversaciones() {
        return conversaciones;
    }

    public void setConversaciones(Map<Contacto, Conversacion> conversaciones) {
        this.conversaciones = conversaciones;
    }

    /**
     * Obtiene la lista de contactos del usuario.
     * @return Una lista de los contactos del usuario.
     */
    public List<Contacto> getContactos() {
        return contactos;
    }

    /**
     * Devuelve una representación en cadena del objeto Usuario.
     * @return Una cadena que representa al usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", ip='" + ip + '\'' +
                ", puerto=" + puerto +
                ", contactos=" + contactos +
                ", conversaciones=" + conversaciones +
                '}';
    }

    /**
     * Compara este usuario con el objeto especificado.
     * @param o El objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return puerto == usuario.puerto && Objects.equals(ip, usuario.ip);
    }

    /**
     * Calcula el código hash del usuario.
     * @return El código hash del usuario.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, ip, puerto);
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}