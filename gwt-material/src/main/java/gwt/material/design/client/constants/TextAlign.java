/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.constants;

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.base.helper.EnumHelper;

public enum TextAlign implements Style.HasCssName {
    DEFAULT(""),
    LEFT("left-align"),
    RIGHT("right-align"),
    CENTER("center-align");

    private final String cssClass;

    TextAlign(final String cssClass) {
        this.cssClass = cssClass;
    }

    @Override
    public String getCssName() {
        return cssClass;
    }

    public static TextAlign fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, TextAlign.class, DEFAULT);
    }
}
