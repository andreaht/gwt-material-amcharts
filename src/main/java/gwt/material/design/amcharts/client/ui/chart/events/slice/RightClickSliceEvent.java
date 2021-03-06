/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
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
package gwt.material.design.amcharts.client.ui.chart.events.slice;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.amcharts.client.ui.chart.events.object.SliceData;
//@formatter:off

/**
 * Dispatched when user right-clicks the slice. Event is an instance of original mouse event.
 *
 * @author kevzlou7979
 */
public class RightClickSliceEvent extends GwtEvent<RightClickSliceEvent.RightClickSliceHandler> {

    public static final Type<RightClickSliceHandler> TYPE = new Type<>();
    private SliceData data;

    public RightClickSliceEvent(SliceData data) {
        this.data = data;
    }

    public static Type<RightClickSliceHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, SliceData data) {
        source.fireEvent(new RightClickSliceEvent(data));
    }

    @Override
    public Type<RightClickSliceHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RightClickSliceHandler handler) {
        handler.onRightClickSliceEvent(this);
    }

    public SliceData getData() {
        return data;
    }

    public interface RightClickSliceHandler extends EventHandler {
        void onRightClickSliceEvent(RightClickSliceEvent event);
    }
}
