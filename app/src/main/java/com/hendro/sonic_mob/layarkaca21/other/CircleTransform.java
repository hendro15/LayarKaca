package com.hendro.sonic_mob.layarkaca21.other;

/**
 * Created by Hendro E. Prabowo on 07/02/2017.
 */

import android.content.Context;
import android.graphics.Bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;


public class CircleTransform extends BitmapTransformation{
    public CircleTransform(Context context){
        super(context);
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        return circleCrop(pool, toTransform);
    }

    private static Bitmap circleCrop(BitmapPool pool, Bitmap source){

        return result;
    }

    @Override
    public String getId() {
        return null;
    }
}
