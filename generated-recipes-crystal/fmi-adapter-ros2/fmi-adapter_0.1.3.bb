# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wraps FMUs for co-simulation"
AUTHOR = "Ralph Lange <ralph.lange@de.bosch.com>"
HOMEPAGE = "http://wiki.ros.org/fmi_adapter"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch \
    launch-ros \
    rclcpp \
    rclcpp-lifecycle \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch-testing \
    rcutils \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/boschresearch/fmi_adapter_ros2-release/archive/release/crystal/fmi_adapter/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "89a362e3ff6681140deeaefee2a411a5"
SRC_URI[sha256sum] = "9fef64ebe842649540c8cf39e015113ac89ae520f644c7119340064d82bfb7ba"
S = "${WORKDIR}/fmi_adapter_ros2-release-release-crystal-fmi_adapter-0.1.3-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/fmi-adapter-ros2/fmi-adapter-ros2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/fmi-adapter-ros2/fmi-adapter-ros2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter-ros2/fmi-adapter-ros2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter-ros2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/fmi-adapter-ros2/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
