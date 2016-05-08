package pe.egcc.app.dto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class ItemDto {

  private String concepto;
  private double valor;

  public ItemDto() {
  }

  public ItemDto(String concepto, double valor) {
    this.concepto = concepto;
    this.valor = valor;
  }

  public String getConcepto() {
    return concepto;
  }

  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}
