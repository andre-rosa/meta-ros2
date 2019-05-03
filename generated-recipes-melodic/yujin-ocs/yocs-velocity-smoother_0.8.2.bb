# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Bound incoming velocity messages according to robot velocity and acceleration limits."
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/yocs_velocity_smoother"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "yocs_velocity_smoother"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    ecl-threads \
    geometry-msgs \
    nav-msgs \
    nodelet \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    ecl-threads \
    geometry-msgs \
    nav-msgs \
    nodelet \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    ecl-threads \
    geometry-msgs \
    nav-msgs \
    nodelet \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_velocity_smoother/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6b631fb38b57d2eafa08c6400501c37a"
SRC_URI[sha256sum] = "9de916242e06317201e15ac26eb33949b8f7aeb84dc262ee44e82ce5ceb3328a"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_velocity_smoother-0.8.2-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('yujin-ocs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/yujin-ocs/yujin-ocs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/yujin-ocs/yujin-ocs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/yujin-ocs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/yujin-ocs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
