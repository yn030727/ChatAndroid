package com.example.chatandroid.ui.component_androidbase.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006)"}, d2 = {"Lcom/example/chatandroid/ui/component_androidbase/view/AndroidBaseFragment;", "Landroidx/fragment/app/Fragment;", "contentLayoutId", "", "(I)V", "datas", "", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "fadapter", "Lcom/example/chatandroid/ui/component_androidbase/view/TabFragmentAdapter;", "getFadapter", "()Lcom/example/chatandroid/ui/component_androidbase/view/TabFragmentAdapter;", "setFadapter", "(Lcom/example/chatandroid/ui/component_androidbase/view/TabFragmentAdapter;)V", "tabs", "Lcom/google/android/material/tabs/TabLayout;", "getTabs", "()Lcom/google/android/material/tabs/TabLayout;", "setTabs", "(Lcom/google/android/material/tabs/TabLayout;)V", "titles", "", "getTitles", "setTitles", "viewpager", "Landroidx/viewpager/widget/ViewPager;", "getViewpager", "()Landroidx/viewpager/widget/ViewPager;", "setViewpager", "(Landroidx/viewpager/widget/ViewPager;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AndroidBaseFragment extends androidx.fragment.app.Fragment {
    public androidx.viewpager.widget.ViewPager viewpager;
    public com.google.android.material.tabs.TabLayout tabs;
    public java.util.List<androidx.fragment.app.Fragment> datas;
    public java.util.List<java.lang.String> titles;
    public com.example.chatandroid.ui.component_androidbase.view.TabFragmentAdapter fadapter;
    
    public AndroidBaseFragment(int contentLayoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.viewpager.widget.ViewPager getViewpager() {
        return null;
    }
    
    public final void setViewpager(@org.jetbrains.annotations.NotNull
    androidx.viewpager.widget.ViewPager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.tabs.TabLayout getTabs() {
        return null;
    }
    
    public final void setTabs(@org.jetbrains.annotations.NotNull
    com.google.android.material.tabs.TabLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<androidx.fragment.app.Fragment> getDatas() {
        return null;
    }
    
    public final void setDatas(@org.jetbrains.annotations.NotNull
    java.util.List<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTitles() {
        return null;
    }
    
    public final void setTitles(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.chatandroid.ui.component_androidbase.view.TabFragmentAdapter getFadapter() {
        return null;
    }
    
    public final void setFadapter(@org.jetbrains.annotations.NotNull
    com.example.chatandroid.ui.component_androidbase.view.TabFragmentAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
}