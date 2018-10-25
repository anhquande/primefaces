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

import org.primefaces.util.ChartUtils;
import org.primefaces.util.FastStringWriter;

import java.io.IOException;
import java.io.Serializable;

public class Legend implements Serializable {

    private boolean display = true;
    private String position;
    private boolean fullWidth = true;
    private boolean reverse = false;
    private LegendLabel labels;

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isFullWidth() {
        return fullWidth;
    }

    public void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public LegendLabel getLabels() {
        return labels;
    }

    public void setLabels(LegendLabel labels) {
        this.labels = labels;
    }

    /**
     * Write the options of Tooltip
     *
     * @return options as JSON object
     * @throws IOException If an I/O error occurs
     */
    public String encode() throws IOException {
        FastStringWriter fsw = new FastStringWriter();

        try {
            ChartUtils.writeDataValue(fsw, "display", this.display, false);
            ChartUtils.writeDataValue(fsw, "position", this.position, true);
            ChartUtils.writeDataValue(fsw, "fullWidth", this.fullWidth, true);
            ChartUtils.writeDataValue(fsw, "reverse", this.reverse, true);
        }
        finally {
            fsw.close();
        }

        return fsw.toString();
    }
}

