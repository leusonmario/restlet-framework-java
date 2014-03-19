/**
 * Copyright 2005-2014 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.test.ext.odata.cafe;




/**
* Generated by the generator tool for the WCF Data Services extension for the Restlet framework.<br>
*
* @see <a href="http://localhost:8111/Cafe.svc/$metadata">Metadata of the target WCF Data Services</a>
*
*/
public class Contact {

private String id;
private String name;
private String title;    /**
     * Constructor without parameter.
     * 
     */
    public Contact() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Contact(String id) {
        this();
        this.id = id;
    }
    
   /**
    * Returns the value of the id attribute.
    *
    * @return The value of the id attribute.
    */
   public String getId() {
      return id;
   }
   
   /**
    * Returns the value of the name attribute.
    *
    * @return The value of the name attribute.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Returns the value of the title attribute.
    *
    * @return The value of the title attribute.
    */
   public String getTitle() {
      return title;
   }
   

   /**
    * Sets the value of the id attribute.
    *
    * @param ID
    *     The value of the id attribute.
    */
   public void setId(String id) {
      this.id = id;
   }
   
   /**
    * Sets the value of the name attribute.
    *
    * @param Name
    *     The value of the name attribute.
    */
   public void setName(String name) {
      this.name = name;
   }
   
   /**
    * Sets the value of the title attribute.
    *
    * @param Title
    *     The value of the title attribute.
    */
   public void setTitle(String title) {
      this.title = title;
   }
   

}
