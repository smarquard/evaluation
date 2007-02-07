/******************************************************************************
 * ItemRenderer.java - created by aaronz@vt.edu
 * 
 * Copyright (c) 2007 Virginia Polytechnic Institute and State University
 * Licensed under the Educational Community License version 1.0
 * 
 * A copy of the Educational Community License has been included in this 
 * distribution and is available at: http://www.opensource.org/licenses/ecl1.php
 * 
 * Contributors:
 * Aaron Zeckoski (aaronz@vt.edu) - primary
 * 
 *****************************************************************************/

package org.sakaiproject.evaluation.tool.renderers;

import org.sakaiproject.evaluation.model.EvalTemplateItem;

import uk.org.ponder.rsf.components.UIContainer;
import uk.org.ponder.rsf.components.UIJointContainer;

/**
 * Interface for class which handles rendering items<br/>
 * This allows us to split out the rendering for items so that we do not
 * have a lot of code duplication
 * 
 * @author Aaron Zeckoski (aaronz@vt.edu)
 */
public interface ItemRenderer {

	/**
	 * Renders an item correctly in a view based on the type and the settings stored within it<br/>
	 * <b>Note:</b> No not attempt to pass a block child item to this, it will not render it and will
	 * throw an exception
	 * 
	 * @param templateItem the templateItem to render (if you only have an item then
	 * simply create an {@link EvalTemplateItem} and wrap the item in it)
	 * @param tofill any RSF {@link UIContainer} object which will contain the rendered item
	 * @param displayNumber the number to display next to this item (if null then render no number)
	 * @param disabled if true, then the item is rendered as disabled and cannot be submitted, if false, the item can be submitted
	 * @return a {@link UIJointContainer} which has been populated correctly
	 */
	public UIJointContainer renderItem(EvalTemplateItem templateItem, UIContainer tofill, Integer displayNumber, boolean disabled);

}
