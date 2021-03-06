/*
 * Java MyCareNet Project.
 * Copyright (C) 2013 e-Contract.be BVBA.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

package be.e_contract.mycarenet.etk;

import java.net.URL;

import javax.xml.namespace.QName;

import be.e_contract.mycarenet.etk.jaxws.EtkDepotService;

/**
 * Factory for ETK JAX-WS service. This factory is using an embedded WSDL and is
 * thus portable.
 * 
 * @author Frank Cornelis
 * 
 */
public class EtkDepotServiceFactory {

	private EtkDepotServiceFactory() {
		super();
	}

	/**
	 * Gives back a new instance of the ETK JAX-WS service.
	 * 
	 * @return
	 */
	public static EtkDepotService newInstance() {
		URL wsdlLocation = EtkDepotServiceFactory.class
				.getResource("/EtkDepot-v1.wsdl");
		QName serviceName = new QName(
				"urn:be:fgov:ehealth:etkdepot:1_0:protocol", "EtkDepotService");
		EtkDepotService service = new EtkDepotService(wsdlLocation, serviceName);
		return service;
	}
}
