# Copyright (c) 2019 LG Electronics, Inc.

LAYERDIR_meta-webos ="${@d.getVar('BBFILE_PATTERN_meta-webos', True)[1:]}"

require ${LAYERDIR_meta-webos}/recipes-core/images/webos-image.bb

IMAGE_INSTALL += "packagegroup-ros-world"
