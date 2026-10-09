<div align="center">

# Lucidity 2.0 (Port / Fork)

**English** • [Русский (README_RU.md)](README_RU.md) • [Main README](README.md)

</div>

---

> [!IMPORTANT]
> **Disclaimer:**
> This repository is an **unofficial fork** of the Lucidity 2.0 mod.
> 
> * **Original Author:** [Ryan100C / hotpad100c](https://github.com/hotpad100c)
> * **Original Repository:** [hotpad100c/lucidity2.0](https://github.com/hotpad100c/lucidity2.0)
> * **Original License:** MIT
> 
> This fork was created solely to port and adapt the mod for **Minecraft 26.3**, fixing Stonecutter mixin descriptors and build preprocessor configuration. All rights to the original code, concept, and assets belong to the original author.

## 🌟 About
**Lucidity** is a client-side technical Minecraft mod (built on Fabric and [MaLiLib](https://github.com/sakura-ryoko/malilib)) that provides a variety of visualization tools for game mechanics:

* **Selective Rendering:** Hide or make selected blocks, mobs, and particles translucent (globally or inside/outside configurable box areas).
* **Explosion Visualizer:** TNT timers, detonation radius, damage rays, and entity damage sampling points.
* **Sculk Sensors & Vibrations:** Detection sphere overlays for sculk sensors, shriekers, the Warden, and vibration propagation tracing.
* **World Eater Mine Helper:** Dangerous block indicators (obsidian, ores, immovable blocks) for digging perimeters and quarries.
* **B36 Preview:** Preview the destination and path of blocks being moved by pistons (Block 36).
* **Container Signals:** Comparator signal strength preview for chests, barrels, and lecterns.
* **Bosses (Ender Dragon & Wither):** Block destruction radiuses and Ender Dragon flight path waypoints.
* And many other utilities (mob spawn highlights, fluid transparency, invisible mob detection).

---

## ⌨️ Controls
* **Open Settings Menu:** Hold **`X`** and press **`V`** by default (MaLiLib hotkey).
* Settings are also accessible via **Mod Menu** (gear icon next to Lucidity).
* Box area selection keys for Selective Rendering can be configured in standard controls:  
  *Options -> Controls -> Key Binds -> category **Selective Renderings***.

---

## 📦 Dependencies
* [Fabric Loader](https://fabricmc.net/)
* [Fabric API](https://curseforge.com/minecraft/mc-mods/fabric-api)
* [MaLiLib](https://curseforge.com/minecraft/mc-mods/malilib)
* [Ryan's Rendering Kit](https://modrinth.com/mod/ryans-rendering-kit)

---

## 🛠️ Building from Source
This project uses [Stonecutter](https://stonecutter.kikugie.dev/) to build across Minecraft versions.

Build version 26.3:
```bash
./gradlew :26.3:assemble
```
The compiled JAR file will appear in `versions/26.3/build/libs/`.
