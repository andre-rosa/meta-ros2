# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "This package provides mapping from frequencies to     IEEE802.11 channels and vice-versa."
AUTHOR = "Devon Ash <dash@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/ieee80211_channels"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "ieee80211_channels"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/ieee80211_channels/1.0.13-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "27c58143a4418e49a6030005810c153c"
SRC_URI[sha256sum] = "80f472b6cc80c82eacfbf5b1bdba951fa3d53730041b74aa7261aa56cc2e5ecf"
S = "${WORKDIR}/linux_networking-release-release-melodic-ieee80211_channels-1.0.13-2"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('linux-networking', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/linux-networking_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/linux-networking-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/linux-networking/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
