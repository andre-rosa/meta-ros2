# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package provides ros nodes for single sensors from Terabee"
AUTHOR = "Krzysztof Żurad <krzysztof.zurad@terabee.com>"
HOMEPAGE = "http://wiki.ros.org/teraranger"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_BPN = "teraranger"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    roscpp \
    sensor-msgs \
    serial \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    roscpp \
    sensor-msgs \
    serial \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    roscpp \
    sensor-msgs \
    serial \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/Terabee/teraranger-release/archive/release/melodic/teraranger/2.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0deece0c38c5c2bd641606e3f2b05ca7"
SRC_URI[sha256sum] = "7a46f25a882f135c1261b889e11462660d26f4b6e6d288d8b2026dfda5f4bc0a"
S = "${WORKDIR}/teraranger-release-release-melodic-teraranger-2.1.0-1"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('teraranger', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teraranger/teraranger_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teraranger/teraranger-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teraranger/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/teraranger/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
