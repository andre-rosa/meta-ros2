# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Metapackage for igvc_self_drive_sim"
AUTHOR = "Micho Radovnikovich <mradov@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "igvc_self_drive_sim"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    igvc-self-drive-description \
    igvc-self-drive-gazebo \
    igvc-self-drive-gazebo-plugins \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/robustify/igvc_self_drive_sim-release/archive/release/melodic/igvc_self_drive_sim/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "009576e58ad6366f68841abaeae66764"
SRC_URI[sha256sum] = "8a843a920d6ffe9cb3c37a6c3e9b07e993aa0373599583f68304e5827883e214"
S = "${WORKDIR}/igvc_self_drive_sim-release-release-melodic-igvc_self_drive_sim-0.1.4-1"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('igvc-self-drive-sim', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/igvc-self-drive-sim/igvc-self-drive-sim_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/igvc-self-drive-sim/igvc-self-drive-sim-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/igvc-self-drive-sim/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/igvc-self-drive-sim/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
