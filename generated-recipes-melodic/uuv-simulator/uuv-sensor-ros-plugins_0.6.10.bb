# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The uuv_sensor_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
ROS_AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "uuv_simulator"
ROS_BPN = "uuv_sensor_ros_plugins"

ROS_BUILD_DEPENDS = " \
    gazebo-plugins \
    gazebo-rosdev \
    geometry-msgs \
    message-filters \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    tf2-ros \
    uuv-gazebo-plugins \
    uuv-sensor-ros-plugins-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-plugins \
    gazebo-rosdev \
    geometry-msgs \
    message-filters \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    tf2-ros \
    uuv-gazebo-plugins \
    uuv-sensor-ros-plugins-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-plugins \
    gazebo-rosdev \
    geometry-msgs \
    message-filters \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2 \
    tf2-ros \
    uuv-gazebo-plugins \
    uuv-sensor-ros-plugins-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rosunit \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c9cf6d054b8f7ce16b8f9c368b6f4381"
SRC_URI[sha256sum] = "0d25b57ad18554d4a85c12a45612cd6a884f7e775fea8c90ed8d58ac2f0d0c36"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_sensor_ros_plugins-0.6.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('uuv-simulator', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('uuv-simulator', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/uuv-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/uuv-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/uuv-simulator/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
