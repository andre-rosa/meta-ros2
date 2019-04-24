# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "gps_umd metapackage"
AUTHOR = "Ken Tossell <ken@tossell.net>"
HOMEPAGE = "http://ros.org/wiki/gps_umd"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gps-common \
    gpsd-client \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gps-common \
    gpsd-client \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/melodic/gps_umd/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b10ff858cc8753d0c42082e5cf7755d5"
SRC_URI[sha256sum] = "8a74ec06defb2718bb21ef216302cc99a063ddf7f3cca8fe8b5a836a9aca9cb8"
S = "${WORKDIR}/gps_umd-release-release-melodic-gps_umd-0.2.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/gps-umd/gps-umd_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/gps-umd/gps-umd_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gps-umd/gps-umd-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gps-umd/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gps-umd/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
