# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides small examples for use of the fmi_adapter package"
AUTHOR = "Ralph Lange <ralph.lange@de.bosch.com>"
HOMEPAGE = "http://wiki.ros.org/fmi_adapter"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    fmi-adapter \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fmi-adapter \
    launch \
    launch-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/boschresearch/fmi_adapter_ros2-release/archive/release/crystal/fmi_adapter_examples/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fe3903c62402f6fe819efdfbbfb52e28"
SRC_URI[sha256sum] = "d7f11e0bf4166888fe9cbdee74a25ae52063a844708dc92accfe267c6f025c4a"
S = "${WORKDIR}/fmi_adapter_ros2-release-release-crystal-fmi_adapter_examples-0.1.3-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fmi-adapter-ros2/fmi-adapter-ros2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fmi-adapter-ros2/fmi-adapter-ros2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter-ros2/fmi-adapter-ros2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter-ros2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter-ros2/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
