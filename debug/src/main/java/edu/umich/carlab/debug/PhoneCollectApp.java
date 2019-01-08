package edu.umich.carlab.debug;

import android.content.Context;
import android.util.Pair;
import edu.umich.carlab.CLDataProvider;
import edu.umich.carlab.apps.SensorListAppBase;
import edu.umich.carlab.sources.sensors.PhoneSensors;

import static edu.umich.carlab.apps.IApp.Type.DCT;

/**
 * Created by arunganesan on 6/24/18.
 */

public class PhoneCollectApp extends SensorListAppBase {
    public PhoneCollectApp(CLDataProvider cl, Context context) {
        super(cl, context);
        name = "PhoneCollectApp";
        type = DCT;
        description = "Only phone sensors";

        sensors.add(new Pair<>(PhoneSensors.DEVICE, PhoneSensors.GPS));
        sensors.add(new Pair<>(PhoneSensors.DEVICE, PhoneSensors.ACCEL));
        sensors.add(new Pair<>(PhoneSensors.DEVICE, PhoneSensors.GYRO));
//        sensors.add(new Pair<>(edu.umich.carlab.sources.apps.VehicleAlignment.APP, edu.umich.carlab.sources.apps.VehicleAlignment.ACCEL));
//        sensors.add(new Pair<>(edu.umich.carlab.sources.apps.VehicleAlignment.APP, edu.umich.carlab.sources.apps.VehicleAlignment.GYRO));
    }
}
