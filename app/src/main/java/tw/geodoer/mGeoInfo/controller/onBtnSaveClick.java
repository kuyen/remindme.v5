package tw.geodoer.mGeoInfo.controller;

import android.content.Context;

import fud.geodoermap.GeoInfo;
import tw.geodoer.main.taskEditor.fields.CommonEditorVar;

/**
 * Created by dan on 2015/4/14.
 */
public class onBtnSaveClick
{

   private static CommonEditorVar mEditorVar ;

    public onBtnSaveClick(GeoInfo geo,Context context) {

        this.mEditorVar = CommonEditorVar.GetInstance();
        mEditorVar.TaskLocation.setName(geo.name);
        mEditorVar.TaskLocation.setLat(geo.latlng.latitude);
        mEditorVar.TaskLocation.setLon(geo.latlng.longitude);

//        ContentValues values =new ContentValues();
//        values.clear();
//        values.put(ColumnLocation.KEY.name, geo.name);
//        values.put(ColumnLocation.KEY.lat, geo.latlng.latitude);
//        values.put(ColumnLocation.KEY.lon, geo.latlng.longitude);
//        values.put(ColumnLocation.KEY.lastUsedTime, System.currentTimeMillis());
//        context.getContentResolver().insert(ColumnLocation.URI, values);
    }
}
