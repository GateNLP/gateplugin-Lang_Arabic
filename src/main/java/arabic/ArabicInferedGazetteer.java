/*
 *  ArabicInferedGazetteer.java
 *
 *  Copyright (c) 1995-2014, The University of Sheffield. See the file
 *  COPYRIGHT.txt in the software or at http://gate.ac.uk/gate/COPYRIGHT.txt
 *
 *  This file is part of GATE (see http://gate.ac.uk/), and is free
 *  software, licenced under the GNU Library General Public License,
 *  Version 2, June 1991 (in the distribution as file licence.html,
 *  and also available at http://gate.ac.uk/gate/licence.html).
 */

package arabic;

import gate.creole.ResourceReference;
import gate.creole.gazetteer.DefaultGazetteer;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name="Arabic Infered Gazetteer")
public class ArabicInferedGazetteer extends DefaultGazetteer {

  private static final long serialVersionUID = -924698124090356105L;

  @CreoleParameter(defaultValue="resources/inferred-gazetteer/lists.def")
	public void setListsURL(ResourceReference url) {
		super.setListsURL(url);
	}
}
