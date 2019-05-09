# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Dock driving library for Kobuki. Users owning a docking station for Kobuki  	    can use this tool to develop autonomous docking drive algorithms."
AUTHOR = "Younghun Ju <yhju@yujinrobot.com>"
ROS_AUTHOR = "Younghun Ju <yhju@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/kobuki_dock_drive"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_core"
ROS_BPN = "kobuki_dock_drive"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-geometry \
    ecl-linear-algebra \
    ecl-threads \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-geometry \
    ecl-linear-algebra \
    ecl-threads \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-geometry \
    ecl-linear-algebra \
    ecl-threads \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_dock_drive/0.7.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1809b105bd16c6b7574b8b3958da6e9b"
SRC_URI[sha256sum] = "4dfca7766cb632cb77dd853c714c4da273b373cb549f891a71533fd0ea36d437"
S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_dock_drive-0.7.8-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('kobuki-core', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('kobuki-core', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/kobuki-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/kobuki-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
