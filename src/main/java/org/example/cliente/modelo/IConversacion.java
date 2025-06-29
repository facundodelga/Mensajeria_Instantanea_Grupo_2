package org.example.cliente.modelo;

import org.example.cliente.modelo.conversacion.Conversacion;
import org.example.cliente.modelo.mensaje.Mensaje;
import org.example.cliente.modelo.usuario.Contacto;

import java.util.List;
import java.util.Map;

public interface IConversacion {
    void addMensajeEntrante(Mensaje mensaje);
    void addMensajeSaliente(Contacto contacto, Mensaje mensaje);
    List<Mensaje> getMensajes(Contacto contacto);
    void agregarConversacion(Contacto contacto);
    void agregarConversacion(Contacto contacto, Conversacion conversacion);
    void setConversacionPendiente(Contacto contacto);
    public void setConversaciones(Map<Contacto, Conversacion> conversaciones);
    public Map<Contacto, Conversacion> getConversaciones();
}
