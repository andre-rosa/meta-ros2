# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The abseil_cpp package"
AUTHOR = "dfaconti <davide.faconti@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=211ba54883815de9f52a3dcd9f281523"

ROS_BUILD_DEPENDS = " \
    rsync \
"

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

SRC_URI = "https://github.com/Eurecat/abseil_cpp-release/archive/release/melodic/abseil_cpp/0.2.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3309ca5a257142e5b445e663908dc72b"
SRC_URI[sha256sum] = "016b0cb70355a46ec06fa709a09117aaed9f8c7351a216634cefdfc642456b91"
S = "${WORKDIR}/abseil_cpp-release-release-melodic-abseil_cpp-0.2.3-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/abseil-cpp/abseil-cpp_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/abseil-cpp/abseil-cpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/abseil-cpp/abseil-cpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/abseil-cpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/abseil-cpp/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
