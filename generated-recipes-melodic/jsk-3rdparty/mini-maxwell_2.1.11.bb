# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mini_maxwell"
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "mini_maxwell"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    roslib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/mini_maxwell/2.1.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d40eb042189e75633d856b643dd8c63d"
SRC_URI[sha256sum] = "a69fc95ceca0f3b9035039ac42b1805c74f2bb0f11dd017e7ec7fbbd1a531e7c"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-mini_maxwell-2.1.11-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/jsk-3rdparty/jsk-3rdparty_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/jsk-3rdparty/jsk-3rdparty_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/jsk-3rdparty-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/jsk-3rdparty/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
