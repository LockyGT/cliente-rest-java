package tech.israelnavarro.demo.restclient.config.entity;

/**
 * 
 * @author israel
 * Entidad contabilidad configuracion,
 * el nombre de la entidad tiene que ir de acuerdo a la información que se+
 * necesita, todas las propiedades de esta entidad se tienen que llamar igual 
 * a la peticion del JSON
 */
public class ContabilidadConfiguracion {

	private Long idConfiguracion;

	private Integer grupoEmpresa;

	private Integer cuentaNumero;

	private String cuentaDigitos;

	private Integer cuentaDecimales;

	private String cuentaMascara;

	private Integer status;

	/**
	 * @return the idConfiguracion
	 */
	public Long getIdConfiguracion() {
		return idConfiguracion;
	}

	/**
	 * @param idConfiguracion the idConfiguracion to set
	 */
	public void setIdConfiguracion(Long idConfiguracion) {
		this.idConfiguracion = idConfiguracion;
	}

	/**
	 * @return the grupoEmpresa
	 */
	public Integer getGrupoEmpresa() {
		return grupoEmpresa;
	}

	/**
	 * @param grupoEmpresa the grupoEmpresa to set
	 */
	public void setGrupoEmpresa(Integer grupoEmpresa) {
		this.grupoEmpresa = grupoEmpresa;
	}

	/**
	 * @return the cuentaNumero
	 */
	public Integer getCuentaNumero() {
		return cuentaNumero;
	}

	/**
	 * @param cuentaNumero the cuentaNumero to set
	 */
	public void setCuentaNumero(Integer cuentaNumero) {
		this.cuentaNumero = cuentaNumero;
	}

	/**
	 * @return the cuentaDigitos
	 */
	public String getCuentaDigitos() {
		return cuentaDigitos;
	}

	/**
	 * @param cuentaDigitos the cuentaDigitos to set
	 */
	public void setCuentaDigitos(String cuentaDigitos) {
		this.cuentaDigitos = cuentaDigitos;
	}

	/**
	 * @return the cuentaDecimales
	 */
	public Integer getCuentaDecimales() {
		return cuentaDecimales;
	}

	/**
	 * @param cuentaDecimales the cuentaDecimales to set
	 */
	public void setCuentaDecimales(Integer cuentaDecimales) {
		this.cuentaDecimales = cuentaDecimales;
	}

	/**
	 * @return the cuentaMascara
	 */
	public String getCuentaMascara() {
		return cuentaMascara;
	}

	/**
	 * @param cuentaMascara the cuentaMascara to set
	 */
	public void setCuentaMascara(String cuentaMascara) {
		this.cuentaMascara = cuentaMascara;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ContabilidadConfiguracion [idConfiguracion=" + idConfiguracion + ", grupoEmpresa=" + grupoEmpresa
				+ ", cuentaNumero=" + cuentaNumero + ", cuentaDigitos=" + cuentaDigitos + ", cuentaDecimales="
				+ cuentaDecimales + ", cuentaMascara=" + cuentaMascara + ", status=" + status + "]";
	}

}
