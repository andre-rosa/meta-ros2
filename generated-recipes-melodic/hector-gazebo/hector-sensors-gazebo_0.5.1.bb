# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "hector_sensors_gazebo depends on the necessary plugins for using the sensors from the hector_models repository."
AUTHOR = "Johannes Meyer <johannes@intermodalics.eu>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_sensors_gazebo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hector_gazebo"
ROS_BPN = "hector_sensors_gazebo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-plugins \
    hector-gazebo-plugins \
    hector-sensors-description \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-plugins \
    hector-gazebo-plugins \
    hector-sensors-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_sensors_gazebo/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4774ecd31703f04cb08b6a9fbbadaba9"
SRC_URI[sha256sum] = "f6c2dbc7c925947b911f5fc7065443bd12d24193b7a9168347c560fab1300d09"
S = "${WORKDIR}/hector_gazebo-release-release-melodic-hector_sensors_gazebo-0.5.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('hector-gazebo', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('hector-gazebo', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-gazebo/hector-gazebo_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-gazebo/hector-gazebo-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-gazebo/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-gazebo/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
