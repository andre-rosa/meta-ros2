# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common rviz API, used by rviz plugins and applications."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros2/rviz/blob/ros2/README.md"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    resource-retriever \
    rviz-assimp-vendor \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-yaml-cpp-vendor \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml-vendor \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    qtbase \
    rclcpp \
    resource-retriever \
    rviz-assimp-vendor \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-yaml-cpp-vendor \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml-vendor \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    qtbase \
    qtbase \
    qtbase \
    qtbase \
    pluginlib \
    rclcpp \
    resource-retriever \
    rviz-ogre-vendor \
    rviz-rendering \
    rviz-yaml-cpp-vendor \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tinyxml-vendor \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-lint-cmake \
    ament-cmake-uncrustify \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_common/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c1a686805060a219b5e106191d7dd151"
SRC_URI[sha256sum] = "b353e9b7b78facc8c0ab45b45b62915f0ce578b29d6f3aba1d366c16ded3b810"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_common-4.0.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rviz/rviz_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/rviz-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rviz/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
