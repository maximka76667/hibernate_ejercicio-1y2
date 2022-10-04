package main;
// Generated 4 oct. 2022 10:39:04 by Hibernate Tools 6.0.2.Final

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 * Asistenciamedica generated by hbm2java
 */
public class Asistenciamedica implements java.io.Serializable {

	private Integer idAsistenciaMedica;
	private Seguro seguro;
	private String breveDescripcion;
	private String lugar;
	private String explicacion;
	private String tipoAsistencia;
	private Date fecha;
	private Time hora;
	private BigDecimal importe;
	private Integer idx;

	public Asistenciamedica() {
	}

	public Asistenciamedica(Seguro seguro, String breveDescripcion, String lugar, String explicacion,
			String tipoAsistencia, Date fecha, Time hora, BigDecimal importe, Integer idx) {
		this.seguro = seguro;
		this.breveDescripcion = breveDescripcion;
		this.lugar = lugar;
		this.explicacion = explicacion;
		this.tipoAsistencia = tipoAsistencia;
		this.fecha = fecha;
		this.hora = hora;
		this.importe = importe;
		this.idx = idx;
	}

	public Integer getIdAsistenciaMedica() {
		return this.idAsistenciaMedica;
	}

	public void setIdAsistenciaMedica(Integer idAsistenciaMedica) {
		this.idAsistenciaMedica = idAsistenciaMedica;
	}

	public Seguro getSeguro() {
		return this.seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public String getBreveDescripcion() {
		return this.breveDescripcion;
	}

	public void setBreveDescripcion(String breveDescripcion) {
		this.breveDescripcion = breveDescripcion;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getExplicacion() {
		return this.explicacion;
	}

	public void setExplicacion(String explicacion) {
		this.explicacion = explicacion;
	}

	public String getTipoAsistencia() {
		return this.tipoAsistencia;
	}

	public void setTipoAsistencia(String tipoAsistencia) {
		this.tipoAsistencia = tipoAsistencia;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public BigDecimal getImporte() {
		return this.importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

}
