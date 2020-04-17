package com.ai.st.microservice.notifier.dto;

import java.io.Serializable;
import java.util.Date;

public class NotificationIntegrationFileGenerationDto implements Serializable {

	private static final long serialVersionUID = 3050930525504636650L;

	private Long userCode;
	private String email;
	private String type;
	private int status;
	private String mpio;
	private String dpto;
	private Date requestDate;

	public NotificationIntegrationFileGenerationDto() {

	}

	public Long getUserCode() {
		return userCode;
	}

	public void setUserCode(Long userCode) {
		this.userCode = userCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMpio() {
		return mpio;
	}

	public void setMpio(String mpio) {
		this.mpio = mpio;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getSubject() {
		return "Notificación Sistema de Transición Barrido Predial – Generación de archivo de integración XTF";
	}

	public String getBody() {
		String html = "";
		html += "<div>El Sistema De Transición para el Barrido Predial en Colombia le informa:</div>";
		html += "<div>Que se ha generado un nuevo insumo producto de la Integración Asistida de los archivos XTF del municipio de "
				+ this.mpio + " del departamento de " + this.dpto + " solicitada el " + this.requestDate.toString()
				+ ".</div>";
		html += "<div>Para mayor detalle por favor diríjase al Sistema de Transición en la siguiente URL e ingrese con su respectivo usuario y contraseña que le ha sido asignada previamente o si es el caso desarróllela directamente en el Asistente LADM_COL del programa QGIS utilizando las mismas credenciales.</div>";
		html += "<div><a href='https://st-pruebas.proadmintierra.info/login'>https://st-pruebas.proadmintierra.info/login</a></div>";
		html += "<div>Nota: Cualquier inquietud o inconveniente en el ingreso a la plataforma por favor comunicarse con el siguiente correo: soporte_ST@proadmintierra.info</div>";
		html += "<div>--</div>";
		html += "SISTEMA DE TRANSICIÓN</div>";
		return html;
	}

}
