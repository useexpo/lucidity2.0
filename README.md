<div align="center">

# Lucidity 2.0 (Port / Fork)

**Language / Язык:**  
[🇬🇧 English](#english) • [🇷🇺 Русский](#russian)  
<sub>*(Standalone files: [English](README_EN.md) | [Русский](README_RU.md))*</sub>

</div>

---

<span id="english"></span>
## 🇬🇧 English

> [!IMPORTANT]
> **Disclaimer:**
> This repository is an **unofficial fork** of the Lucidity 2.0 mod.
> 
> * **Original Author:** [Ryan100C / hotpad100c](https://github.com/hotpad100c)
> * **Original Repository:** [hotpad100c/lucidity2.0](https://github.com/hotpad100c/lucidity2.0)
> * **Original License:** MIT
> 
> This fork was created solely to port and adapt the mod for **Minecraft 26.3**, fixing Stonecutter mixin descriptors and build preprocessor configuration. All rights to the original code, concept, and assets belong to the original author.

### 🌟 About
**Lucidity** is a client-side technical Minecraft mod (built on Fabric and [MaLiLib](https://github.com/sakura-ryoko/malilib)) that provides a variety of visualization tools for game mechanics:

* **Selective Rendering:** Hide or make selected blocks, mobs, and particles translucent (globally or inside/outside configurable box areas).
* **Explosion Visualizer:** TNT timers, detonation radius, damage rays, and entity damage sampling points.
* **Sculk Sensors & Vibrations:** Detection sphere overlays for sculk sensors, shriekers, the Warden, and vibration propagation tracing.
* **World Eater Mine Helper:** Dangerous block indicators (obsidian, ores, immovable blocks) for digging perimeters and quarries.
* **B36 Preview:** Preview the destination and path of blocks being moved by pistons (Block 36).
* **Container Signals:** Comparator signal strength preview for chests, barrels, and lecterns.
* **Bosses (Ender Dragon & Wither):** Block destruction radiuses and Ender Dragon flight path waypoints.
* And many other utilities (mob spawn highlights, fluid transparency, invisible mob detection).

### ⌨️ Controls
* **Open Settings Menu:** Hold **`X`** and press **`V`** by default (MaLiLib hotkey).
* Settings are also accessible via **Mod Menu** (gear icon next to Lucidity).
* Box area selection keys for Selective Rendering can be configured in standard controls:  
  *Options -> Controls -> Key Binds -> category **Selective Renderings***.

### 📦 Dependencies
* [Fabric Loader](https://fabricmc.net/)
* [Fabric API](https://curseforge.com/minecraft/mc-mods/fabric-api)
* [MaLiLib](https://curseforge.com/minecraft/mc-mods/malilib)
* [Ryan's Rendering Kit](https://modrinth.com/mod/ryans-rendering-kit)

### 🛠️ Building from Source
This project uses [Stonecutter](https://stonecutter.kikugie.dev/) to build across Minecraft versions.

Build version 26.3:
```bash
./gradlew :26.3:assemble
```
The compiled JAR file will appear in `versions/26.3/build/libs/`.

---

<span id="russian"></span>
## 🇷🇺 Русский

> [!IMPORTANT]
> **Отказ от авторства:**
> Этот репозиторий является **неофициальным форком** мода Lucidity 2.0.
> 
> * **Оригинальный автор:** [Ryan100C / hotpad100c](https://github.com/hotpad100c)
> * **Оригинальный репозиторий:** [hotpad100c/lucidity2.0](https://github.com/hotpad100c/lucidity2.0)
> * **Лицензия оригинала:** MIT
> 
> Этот форк создан исключительно с целью портирования и адаптации мода под **Minecraft 26.3** и исправления дескрипторов миксинов / конфигурации препроцессора Stonecutter. Все права на оригинальный код, идею и графику принадлежат оригинальному автору.

### 🌟 О моде
**Lucidity** — это клиентский технический мод для Minecraft (на базе Fabric и [MaLiLib](https://github.com/sakura-ryoko/malilib)), предоставляющий разнообразные инструменты визуализации игровых механик:

* **Выборочный рендеринг (Selective Rendering):** скрытие или прозрачность выбранных блоков, мобов и частиц (глобально или внутри/снаружи выделенных зон-коробок).
* **Визуализация взрывов (Explosion Visualizer):** таймеры TNT, радиус детонации, лучи урона и точки выборки урона по сущностям.
* **Скалк-сенсоры и вибрации:** подсветка сфер детекции скалк-сенсоров, визгунов, вардена и трассировка распространения вибраций.
* **World Eater Mine Helper:** индикаторы опасных блоков (обсидиан, руды, несдвигаемые блоки) для копания периметров и карьеров.
* **B36 Preview:** предпросмотр конечной позиции блоков, перемещаемых поршнями (Block 36).
* **Сигналы контейнеров:** предпросмотр силы редстоун-сигнала компаратора из сундуков, бочек и лекторнов.
* **Боссы (Ender Dragon & Wither):** радиусы разрушения блоков и путевые точки маршрута дракона Края.
* И множество других утилит (подсветка спавна мобов, прозрачность жидкостей, обнаружение невидимых мобов).

### ⌨️ Управление
* **Открыть меню настроек:** по умолчанию зажать **`X`** и нажать **`V`** (хоткей MaLiLib).
* Также настройки доступны через **Mod Menu** (шестерёнка напротив Lucidity).
* Клавиши управления выделением областей для выборочного рендеринга настраиваются в обычном меню:  
  *Настройки -> Управление -> Назначение клавиш -> категория **Selective Renderings***.

### 📦 Зависимости
* [Fabric Loader](https://fabricmc.net/)
* [Fabric API](https://curseforge.com/minecraft/mc-mods/fabric-api)
* [MaLiLib](https://curseforge.com/minecraft/mc-mods/malilib)
* [Ryan's Rendering Kit](https://modrinth.com/mod/ryans-rendering-kit)

### 🛠️ Сборка из исходников
Проект использует [Stonecutter](https://stonecutter.kikugie.dev/) для сборки под несколько версий.

Сборка версии 26.3:
```bash
./gradlew :26.3:assemble
```
Собранный JAR-файл появится в папке `versions/26.3/build/libs/`.
