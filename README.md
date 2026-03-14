# android-checkbox-demo

## 简介

演示 CheckBox 复选框组件的使用，实现多选功能。

## 基本原理

- CheckBox 提供勾选/取消勾选的交互
- 每个 CheckBox 独立运行，可以同时选中多个
- 通过 `isChecked` 属性判断选中状态

## 启动和使用

### 环境要求
- Android Studio 4.0+
- JDK 11+

### 安装和运行
1. 用 Android Studio 打开此项目
2. 选择多个选项
3. 点击按钮查看选择结果

## 教程

### CheckBox 基础

```xml
<CheckBox
    android:id="@+id/checkBox1"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="选项一" />
```

### 判断选中状态

```kotlin
val checkBox = findViewById<CheckBox>(R.id.checkBox1)

// 判断是否选中
if (checkBox.isChecked) {
    // 选中状态
}

// 获取所有选中的项
if (checkBox1.isChecked) {
    result += "苹果 "
}
```

### 注意事项

- CheckBox 可以单独使用，不需要 RadioGroup
- 多个 CheckBox 可以同时选中
- 通常配合按钮获取所有选中状态
