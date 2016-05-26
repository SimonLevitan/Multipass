/*
    Multipass, Nukkit permissions plugin
    Copyright (C) 2016  fromgate, nukkit.ru

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ru.nukkit.multipass.util;

import cn.nukkit.utils.ConfigSection;
import cn.nukkit.utils.SimpleConfig;
import ru.nukkit.multipass.MultipassPlugin;

public class Cfg extends SimpleConfig {

    @Path("general.language")
    public String language = "default";

    @Path("general.language-save")
    public boolean saveLanguage = true;

    @Path("general.debug")
    public boolean debugMode = true;

    // Default group, will be added automatically for all new users
    @Path("permissions.group.default-group")
    public String defaultGroup = "default";

    @Path("permissions.group.default-priority")
    public int groupPriority = 10;

    @Path("permissions.user.default-priority")
    public int userPriority = 100;

    // Global or per-world permissions
    @Path("permissions.multiworld.enable")
    public boolean enableWorldSupport = false;

    /*
      mirrors:
        world_mirrored_to:world_mirrored_from
     */
    @Path("permissions.multiworld.mirrors")
    public ConfigSection mirros = new ConfigSection();

    public Cfg() {
        super(MultipassPlugin.getPlugin());
    }
}
