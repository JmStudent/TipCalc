package com.migremlin.tipcalc.fragments;

import com.migremlin.tipcalc.models.TipRecord;

/**
 * Created by JM Peña on 07/07/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
