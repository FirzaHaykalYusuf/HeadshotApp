package com.firza.headshotapp.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/firza/headshotapp/ui/navigation/Screen;", "", "route", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "resourceId", "", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;I)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getResourceId", "()I", "getRoute", "()Ljava/lang/String;", "CameraScreen", "FormScreen", "MainScreen", "Lcom/firza/headshotapp/ui/navigation/Screen$CameraScreen;", "Lcom/firza/headshotapp/ui/navigation/Screen$FormScreen;", "Lcom/firza/headshotapp/ui/navigation/Screen$MainScreen;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.ui.graphics.vector.ImageVector icon = null;
    private final int resourceId = 0;
    
    private Screen(java.lang.String route, androidx.compose.ui.graphics.vector.ImageVector icon, @androidx.annotation.StringRes
    int resourceId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return null;
    }
    
    public final int getResourceId() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/firza/headshotapp/ui/navigation/Screen$MainScreen;", "Lcom/firza/headshotapp/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class MainScreen extends com.firza.headshotapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.firza.headshotapp.ui.navigation.Screen.MainScreen INSTANCE = null;
        
        private MainScreen() {
            super(null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/firza/headshotapp/ui/navigation/Screen$CameraScreen;", "Lcom/firza/headshotapp/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class CameraScreen extends com.firza.headshotapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.firza.headshotapp.ui.navigation.Screen.CameraScreen INSTANCE = null;
        
        private CameraScreen() {
            super(null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/firza/headshotapp/ui/navigation/Screen$FormScreen;", "Lcom/firza/headshotapp/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class FormScreen extends com.firza.headshotapp.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.firza.headshotapp.ui.navigation.Screen.FormScreen INSTANCE = null;
        
        private FormScreen() {
            super(null, null, 0);
        }
    }
}