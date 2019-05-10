# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "imu_pipeline"
AUTHOR = "Paul Bovbel <pbovbel@clearpathrobotics.com>"
ROS_AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/imu_pipeline"
SECTION = "devel"
LICENSE = "BSD & GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "imu_pipeline"
ROS_BPN = "imu_pipeline"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    imu-processors \
    imu-transformer \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    imu-processors \
    imu-transformer \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/imu_pipeline-release/archive/release/melodic/imu_pipeline/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "eb11d64326a2d2d8d9212f9e63c9d089"
SRC_URI[sha256sum] = "9ee5a8bc23b24ed9fc68e57f0a23a27cee64664c6cddd61e6ce6474d2545c3aa"
S = "${WORKDIR}/imu_pipeline-release-release-melodic-imu_pipeline-0.2.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('imu-pipeline', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('imu-pipeline', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-pipeline/imu-pipeline_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-pipeline/imu-pipeline-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-pipeline/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-pipeline/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
