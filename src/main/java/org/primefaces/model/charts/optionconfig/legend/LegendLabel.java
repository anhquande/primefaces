/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.model.charts.optionconfig.legend;

import java.io.Serializable;

public class LegendLabel implements Serializable {

    private static final long serialVersionUID = -1702755814202853555L;
    private Number boxWidth = 40;
    private Number fontSize = 12;
    private String fontStyle = "normal";
    private String fontColor = "#666";
    private String fontFamily = "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif";
    private Number padding = 10;
    private String generateLabels;
    private String filter;
    private boolean usePointStyle;

    public Number getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(Number boxWidth) {
        this.boxWidth = boxWidth;
    }

    public Number getFontSize() {
        return fontSize;
    }

    public void setFontSize(Number fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Number getPadding() {
        return padding;
    }

    public void setPadding(Number padding) {
        this.padding = padding;
    }

    public String getGenerateLabels() {
        return generateLabels;
    }

    public void setGenerateLabels(String generateLabels) {
        this.generateLabels = generateLabels;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public boolean isUsePointStyle() {
        return usePointStyle;
    }

    public void setUsePointStyle(boolean usePointStyle) {
        this.usePointStyle = usePointStyle;
    }
}
