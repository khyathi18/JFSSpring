package edu.shopping;

import java.util.List;

public class Products {

	List prodList;

	public List getProdList() {
		return prodList;
	}

	public void setProdList(List prodList) {
		this.prodList = prodList;
	}

	@Override
	public String toString() {
		return "Products [prodList=" + prodList + "]";
	}
	
}
