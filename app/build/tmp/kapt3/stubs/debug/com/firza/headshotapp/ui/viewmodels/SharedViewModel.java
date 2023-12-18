package com.firza.headshotapp.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0007J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0019H\u0002J\u0016\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010$\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u0007J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0007J\u0016\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rJ\u0010\u0010*\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\nJ\f\u0010+\u001a\u00020\u0019*\u00020\nH\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011\u00a8\u0006,"}, d2 = {"Lcom/firza/headshotapp/ui/viewmodels/SharedViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_imageUri", "Landroidx/lifecycle/MutableLiveData;", "Landroid/net/Uri;", "_processedImageUri", "_segmentationMask", "Lcom/google/mlkit/vision/segmentation/SegmentationMask;", "_userData", "Lkotlin/Pair;", "", "imageUri", "Landroidx/lifecycle/LiveData;", "getImageUri", "()Landroidx/lifecycle/LiveData;", "processedImageUri", "getProcessedImageUri", "segmentationMask", "getSegmentationMask", "userData", "getUserData", "createBitmapFromMask", "Landroid/graphics/Bitmap;", "mask", "originalBitmap", "processImageWithMLKit", "", "context", "Landroid/content/Context;", "removeBackgroundFromImage", "saveImageToStorage", "bitmap", "saveImageUriToPreferences", "setImageUri", "uri", "setProcessedImageUri", "setUserData", "name", "phone", "updateSegmentationMask", "toBitmap", "app_debug"})
public final class SharedViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<android.net.Uri> _imageUri = null;
    private final androidx.lifecycle.MutableLiveData<android.net.Uri> _processedImageUri = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<android.net.Uri> processedImageUri = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> _userData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.String, java.lang.String>> userData = null;
    private final androidx.lifecycle.MutableLiveData<com.google.mlkit.vision.segmentation.SegmentationMask> _segmentationMask = null;
    
    public SharedViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<android.net.Uri> getImageUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<android.net.Uri> getProcessedImageUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.String, java.lang.String>> getUserData() {
        return null;
    }
    
    public final void setProcessedImageUri(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    public final void setUserData(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String phone) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.google.mlkit.vision.segmentation.SegmentationMask> getSegmentationMask() {
        return null;
    }
    
    public final void updateSegmentationMask(@org.jetbrains.annotations.Nullable
    com.google.mlkit.vision.segmentation.SegmentationMask mask) {
    }
    
    public final void setImageUri(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
    }
    
    public final void removeBackgroundFromImage(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri imageUri) {
    }
    
    public final void processImageWithMLKit(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri imageUri) {
    }
    
    private final android.graphics.Bitmap createBitmapFromMask(com.google.mlkit.vision.segmentation.SegmentationMask mask, android.graphics.Bitmap originalBitmap) {
        return null;
    }
    
    private final android.graphics.Bitmap toBitmap(com.google.mlkit.vision.segmentation.SegmentationMask $this$toBitmap) {
        return null;
    }
    
    public final void saveImageUriToPreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri imageUri) {
    }
    
    private final android.net.Uri saveImageToStorage(android.content.Context context, android.graphics.Bitmap bitmap) {
        return null;
    }
}