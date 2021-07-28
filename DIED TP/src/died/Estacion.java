package died;

import java.time.LocalDate;

public class Estacion {
	Integer ID;
	String nombre;
	LocalDate horarioApertura, horarioCierre;
	EstadoEstacion estado;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getHorarioApertura() {
		return horarioApertura;
	}
	public void setHorarioApertura(LocalDate horarioApertura) {
		this.horarioApertura = horarioApertura;
	}
	public LocalDate getHorarioCierre() {
		return horarioCierre;
	}
	public void setHorarioCierre(LocalDate horarioCierre) {
		this.horarioCierre = horarioCierre;
	}
	public EstadoEstacion getEstado() {
		return estado;
	}
	public void setEstado(EstadoEstacion estado) {
		this.estado = estado;
	}
	public Estacion(String nombre, LocalDate horarioApertura, LocalDate horarioCierre, EstadoEstacion estado) {
		super();
		this.nombre = nombre;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.estado = estado;
	}
	
	public void cambiarEstado() {
		
		if(estado == EstadoEstacion.ENMANTENIMIENTO) estado = EstadoEstacion.OPERATIVA;
		else estado = EstadoEstacion.ENMANTENIMIENTO;
		
		
	}
	
}
