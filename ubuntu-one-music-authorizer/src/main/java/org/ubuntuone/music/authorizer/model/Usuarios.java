/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubuntuone.music.authorizer.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios implements Serializable{
	private static final long serialVersionUID = -8307160464127852510L;
	
	@Id
	private int idUsuario;
	private String login;
	private String password;
	private String nombre;
	private String direccionCorreo;
	private String telefono;
	private int tipo;
	private int estadoDeRegistro;
    private String passwordEliminacion;

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccionCorreo() {
		return direccionCorreo;
	}

	public int getTipo() {
		return tipo;
	}

	public String getLogin() {
		return login;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getPassword() {
		return password;
	}

    public void setEstadoDeRegistro(int estadoDeRegistro) {
        this.estadoDeRegistro = estadoDeRegistro;
    }

    public int getEstadoDeRegistro() {
        return estadoDeRegistro;
    }

    public void setPasswordEliminacion(String passwordEliminacion) {
        this.passwordEliminacion = passwordEliminacion;
    }

    public String getPasswordEliminacion() {
        return passwordEliminacion;
    }

	public Usuarios(){}

}
