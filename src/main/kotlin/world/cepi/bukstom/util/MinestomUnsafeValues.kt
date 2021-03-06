package world.cepi.bukstom.util

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.UnsafeValues
import org.bukkit.advancement.Advancement
import org.bukkit.block.data.BlockData
import org.bukkit.inventory.ItemStack
import org.bukkit.material.MaterialData
import org.bukkit.plugin.PluginDescriptionFile
import java.util.logging.Level

object MinestomUnsafeValues: UnsafeValues {
    override fun toLegacy(material: Material?): Material {
        TODO("Not yet implemented")
    }

    override fun fromLegacy(material: Material?): Material {
        TODO("Not yet implemented")
    }

    override fun fromLegacy(material: MaterialData?): Material {
        TODO("Not yet implemented")
    }

    override fun fromLegacy(material: MaterialData?, itemPriority: Boolean): Material {
        TODO("Not yet implemented")
    }

    override fun fromLegacy(material: Material?, data: Byte): BlockData {
        TODO("Not yet implemented")
    }

    override fun getMaterial(material: String?, version: Int): Material {
        TODO("Not yet implemented")
    }

    override fun getDataVersion(): Int {
        TODO("Not yet implemented")
    }

    override fun modifyItemStack(stack: ItemStack?, arguments: String?): ItemStack {
        TODO("Not yet implemented")
    }

    override fun checkSupported(pdf: PluginDescriptionFile?) {
        TODO("Not yet implemented")
    }

    fun isLegacy(pdf: PluginDescriptionFile): Boolean {
        return pdf.apiVersion == null
    }


    override fun processClass(pdf: PluginDescriptionFile, path: String, clazz: ByteArray): ByteArray? {
        return try {
            Commodore.convert(clazz, !isLegacy(pdf))
        } catch (ex: Exception) {
            Bukkit.getLogger().log(Level.SEVERE, "Fatal error trying to convert " + pdf.fullName + ":" + path, ex)
            null
        }

    }

    override fun loadAdvancement(key: NamespacedKey?, advancement: String?): Advancement {
        TODO("Not yet implemented")
    }

    override fun removeAdvancement(key: NamespacedKey?): Boolean {
        TODO("Not yet implemented")
    }
}