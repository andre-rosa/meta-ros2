# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "Robot-independent Gazebo plugins for sensors, motors and dynamic reconfigurable components."
AUTHOR = "Jose Luis Rivero <jrivero@osrfoundation.org>"
ROS_AUTHOR = "John Hsu"
HOMEPAGE = "http://gazebosim.org/tutorials?cat=connect_ros"
SECTION = "devel"
LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f7d4e3a22e6490b133f4eb99348a8124"

ROS_CN = "gazebo_ros_pkgs"
ROS_BPN = "gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    gazebo-ros \
    gazebo-rosdev \
    geometry-msgs \
    image-transport \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    geometry-msgs \
    image-transport \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    gazebo-ros \
    gazebo-rosdev \
    geometry-msgs \
    image-transport \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    cv-bridge \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/crystal/gazebo_plugins/3.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "af70b6e66818e7c3dc24daf3312a78ea"
SRC_URI[sha256sum] = "51a0467974dfe60f044ee9ce790bf66bd17cd0c3c2f342aacc7711bb7673fe8c"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-crystal-gazebo_plugins-3.2.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('gazebo-ros-pkgs', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('gazebo-ros-pkgs', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gazebo-ros-pkgs/gazebo-ros-pkgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gazebo-ros-pkgs/gazebo-ros-pkgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gazebo-ros-pkgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/gazebo-ros-pkgs/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
