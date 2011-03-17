/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.kurka.phonegap.client.contacts.js;

import de.kurka.phonegap.client.contacts.ContactAddress;
import de.kurka.phonegap.client.contacts.ContactFactory;
import de.kurka.phonegap.client.contacts.ContactField;
import de.kurka.phonegap.client.contacts.ContactOrganisation;

public class ContactFactoryJsoImpl implements ContactFactory {

	@Override
	public native ContactField createContactField(String type, String value, boolean pref) /*-{
		return new ContactField(type, value, pref);
	}-*/;

	@Override
	public native ContactOrganisation createContactOrganisation(String name, String department, String title) /*-{
		var co = {};

		co.name = name;
		co.department = department;
		co.title = title;

		return co;

	}-*/;

	@Override
	public native ContactAddress createContactAddress(String formatted, String streetAddress, String locality, String region, String postalCode, String country) /*-{
		var ca = {};

		ca.formatted = formatted;
		ca.streetAddress = streetAddress;
		ca.locality = locality;
		ca.region = region;
		ca.postalCode = postalCode;
		ca.country = country;
		return ca;
	}-*/;

}
