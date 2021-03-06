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
package gwt.material.design.amcharts.client.ui.stock.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.amcharts.client.ui.stock.events.object.StockDateData;
//@formatter:off

/**
 * Dispatched when the user clicks on the Stock event (bullet).
 *
 * @author kevzlou7979
 */
public class ClickStockEvent extends GwtEvent<ClickStockEvent.ClickStockHandler> {

    public static final Type<ClickStockHandler> TYPE = new Type<>();
    private StockDateData data;

    public ClickStockEvent(StockDateData data) {
        this.data = data;
    }

    public static Type<ClickStockHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, StockDateData data) {
        source.fireEvent(new ClickStockEvent(data));
    }

    @Override
    public Type<ClickStockHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ClickStockEvent.ClickStockHandler handler) {
        handler.onClickStock(this);
    }

    public StockDateData getData() {
        return data;
    }

    public interface ClickStockHandler extends EventHandler {
        void onClickStock(ClickStockEvent event);
    }
}
