package com.cdac.acts.tejas;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Printer implements Serializable {

	private Integer serialNo;
	private Integer modelNo;
	private Double price;
	private LocalDate manufacturingDate;
	private PrinterType printerType;
	
	public Printer(Integer serialNo, Integer modelNo, Double price, LocalDate manufacturingDate,
			PrinterType printerType) {
		super();
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.printerType = printerType;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public Integer getModelNo() {
		return modelNo;
	}

	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public PrinterType getPrinterType() {
		return printerType;
	}

	public void setPrinterType(PrinterType printerType) {
		this.printerType = printerType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturingDate, modelNo, price, printerType, serialNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Printer other = (Printer) obj;
		return Objects.equals(manufacturingDate, other.manufacturingDate) && Objects.equals(modelNo, other.modelNo)
				&& Objects.equals(price, other.price) && printerType == other.printerType
				&& Objects.equals(serialNo, other.serialNo);
	}

	@Override
	public String toString() {
		return "Printer [serialNo=" + serialNo + ", modelNo=" + modelNo + ", price=" + price + ", manufacturingDate="
				+ manufacturingDate + ", printerType=" + printerType + "]";
	}
	
	
}
