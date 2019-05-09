# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Package with external libraries used in Industrial and Service workspaces. Currentlly supported Libraries: Reflexxes, Libmodbus."
AUTHOR = "Denis Štogl <denis.stogl@kit.edu>"
ROS_AUTHOR = "Denis Štogl <denis.stogl@kit.edu>"
HOMEPAGE = "https://github.com/KITrobotics/ipr_extern"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "ipr_extern"
ROS_BPN = "ipr_extern"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libmodbus \
    libreflexxestype2 \
    ros-reflexxes \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/KITrobotics/ipr_extern-release/archive/release/melodic/ipr_extern/0.8.8-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bf510efe8f2ce724844e8518fd9bf096"
SRC_URI[sha256sum] = "a117475704fac421bb5f283eb775ab4339944f6ea148c2c996c0fb7642bb0fe8"
S = "${WORKDIR}/ipr_extern-release-release-melodic-ipr_extern-0.8.8-1"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('ipr-extern', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ipr-extern', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ipr-extern/ipr-extern_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ipr-extern/ipr-extern-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ipr-extern/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ipr-extern/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
