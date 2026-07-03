package com.rits.tests.perspectives.model;

import java.util.Arrays;

/**
 * @author kostantinos.kougios
 *
 * 1 Dec 2009
 */
public class Products extends ProductsCollection<Product>
{
	private static final long	serialVersionUID	= 1944962567406768711L;

	public Products(final Product... ps)
	{
		super();
		this.addAll(Arrays.asList(ps));
	}
}
